package com.test.dao;

import com.test.beans.User;

import static com.test.dao.DAOUtilitaire.fermeturesSilencieuses;
import static com.test.dao.DAOUtilitaire.initialisationRequetePreparee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAOImpl {
    private static final String     SQL_SELECT = "SELECT code, nom, prenom, mail, mdp FROM USER";
    private static final String     SQL_SELECT_MAIL = "SELECT code, nom, prenom, mail, mdp FROM USER WHERE mail = ?";
    private static final String     SQL_SELECT_CLIENT = "SELECT code, nom, prenom, mail, mdp, nomEnterprise FROM CLIENT";
    private static final String     SQL_SELECT_MAIL_CLIENT = "SELECT code, nom, prenom, mail, mdp, nomEnterprise FROM CLIENT WHERE mail = ?";
    private static final String     SQL_INSERT = "INSERT  INTO USER(code, nom, prenom, mail, mdp) VALUES (?, ?, ?, ?, ?)";
    private DAOFactory              daoFactory;


    UserDAOImpl(DAOFactory daoFactory){
        this.daoFactory = daoFactory;
    }

    public User trouver(String mail) throws DAOException{
        return trouver(SQL_SELECT_MAIL, mail);
    }

    public ArrayList<User>      trouvertous() throws DAOException{
        return trouvertous(SQL_SELECT);
    }

    private User    trouver(String sql, Object... objets) throws DAOException{
        Connection          connexion = null;
        PreparedStatement   preparedStatement = null;
        ResultSet           resultSet = null;
        User                utilisateur = null;
        try {
            connexion = daoFactory.getConnection();
            preparedStatement = initialisationRequetePreparee(connexion, sql, false, objets);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                utilisateur = map(resultSet);
            }
        } catch (SQLException e){
            throw new DAOException(e);
        } finally {
            fermeturesSilencieuses(resultSet, preparedStatement, connexion);
        }
        return utilisateur;

    }

    private ArrayList<User>     trouvertous(String sql, Object... objects) throws DAOException{
        Connection          connexion = null;
        PreparedStatement   preparedStatement = null;
        ResultSet           resultSet = null;
        User                utilisateurs = null;
        ArrayList<User>     listeusers = new ArrayList<User>();

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = initialisationRequetePreparee(connexion, sql, false, objets);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                utilisateurs = map(resultSet);
                System.out.println("nom: " + utilisateurs.getNom());
                listeusers.add(utilisateurs);
            }
        } catch (SQLException e){
            throw new DAOException(e);
        } finally {
            fermeturesSilencieuses(resultSet, preparedStatement, connexion);
        }
        return listeusers;
    }

    public void creer(User utilisateur) throws DAOException{
        Connection          connexion = null;
        PreparedStatement   preparedStatement = null;
        ResultSet           valeurAutoGenerees = null;

        try{
            connexion = daoFactory.getConnection();
            preparedStatement = initialisationRequetePreparee(connexion, SQL_INSERT, true, utilisateur.getCode(),
                                                                utilisateur.getNom(), utilisateur.getPrenom(), utilisateur.getMail(), utilisateur.getMdp());
            int statut = preparedStatement.executeUpdate();
            if (statut == 0){
                throw new DAOException("Echec UserDAOImpl creer");
            }
            valeurAutoGenerees = preparedStatement.getGenerateKeys();
            if (valeurAutoGenerees.next()){
                utilisateur.setCode(valeurAutoGenerees.getInt(1));
            }
            else{
                throw new DAOException("Echec UserDAOImpl 2");
            }
        } catch (SQLException e){
            throw new DAOException(e);
        } finally {
            fermeturesSilencieuses(valeurAutoGenerees, preparedStatement, connexion);
        }
    }

    private static          User map(ResultSet resultSet) throws SQLException{
        User    utilisateur = new User();
        utilisateur.setCode(resultSet.getInt('code'));
        utilisateur.setNom(resultSet.getString('nom'));
        utilisateur.setPrenom(resultSet.getString('prenom'));
        utilisateur.setMail(resultSet.getString('mail'));
        utilisateur.setMdp(resultSet.getString('mdp'));
    }


}
