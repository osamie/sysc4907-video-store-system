package com.team33.entities.dao;

import java.util.List;

import com.team33.entities.*;
import org.springframework.dao.DataAccessException;

/**
 * Dictates the data access methods for the account services
 *
 * @author Samual
 */
public interface AccountDao {

    /**
     * Retrieves all accounts
     *
     * @return List<Account>
     * @throws DataAccessException
     */
    public List<Account> getAccounts() throws DataAccessException;

    /**
     * Retrieves a user account
     *
     * @param accountId
     * @return Account
     * @throws DataAccessException
     */
    public Account getAccount(Integer accountId) throws DataAccessException;

    /**
     * Retrieves a user account
     *
     * @param username
     * @return Account
     * @throws DataAccessException
     */
    public Account getAccount(String username) throws DataAccessException;

    /**
     * Persists an account
     *
     * @param account
     * @throws DataAccessException
     */
    public void saveAccount(Account account) throws DataAccessException;

    /**
     * Removes an account
     *
     * @param accountID
     */
    public void removeAccount(Integer accountID);
}
