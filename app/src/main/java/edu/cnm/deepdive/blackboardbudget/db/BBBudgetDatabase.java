package edu.cnm.deepdive.blackboardbudget.db;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import edu.cnm.deepdive.blackboardbudget.coverters.DateTypeConverter;
import edu.cnm.deepdive.blackboardbudget.models.Budget;
import edu.cnm.deepdive.blackboardbudget.models.Transaction;
import edu.cnm.deepdive.blackboardbudget.models.TransactionTypes;
import edu.cnm.deepdive.blackboardbudget.models.User;

@Database(entities = {User.class, Budget.class, Transaction.class, TransactionTypes.class},
    version = 1, exportSchema = true)
@TypeConverters({DateTypeConverter.class})
public class BBBudgetDatabase extends RoomDatabase {


  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
    return null;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return null;
  }
}
