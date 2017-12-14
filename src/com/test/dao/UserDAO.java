package com.test.dao;

import com.test.beans.User;

import java.util.ArrayList;

public class UserDAO {
    void    creer(User utilisateur) throws DAOException;
    User    trouver(String mail) throws DAOException;
    ArrayList<User>     trouvertous() throws DAOException;

}
