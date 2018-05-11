package edu.cnm.deepdive.blackboardbudget.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.blackboardbudget.models.Type;

@Dao
public interface TypeDao {

  @Query("SELECT * FROM type")
  Type getAll();

  @Query("SELECT * FROM type WHERE type_id LIKE :typeId LIMIT 1")
  Type findById(long typeId);

  @Query("SELECT * FROM type WHERE type LIKE :type LIMIT 1")
  Type findByType(String type);

}
