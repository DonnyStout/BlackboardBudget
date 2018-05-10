package edu.cnm.deepdive.blackboardbudget.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.blackboardbudget.models.User;

@Dao
public interface UserDao {


  @Query("SELECT * FROM user WHERE user_id LIKE :userId LIMIT 1")
  User findByUser(long userId);

  @Query("SELECT * FROM user WHERE username LIKE :username LIMIT 1")
  User findByUsername(String username);
}
