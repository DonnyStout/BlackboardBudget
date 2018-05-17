package edu.cnm.deepdive.blackboardbudget.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.blackboardbudget.models.ExpenseType;

@Dao
public interface ExpenseTypeDao {


  @Query("SELECT * FROM expensetype WHERE expense_id LIKE :expenseId LIMIT 1")
  ExpenseType findByExpenseId(long expenseId);

  @Query("SELECT * FROM expensetype WHERE type_id LIKE :typeId LIMIT 1")
  ExpenseType findByTypeId(long typeId);
}
