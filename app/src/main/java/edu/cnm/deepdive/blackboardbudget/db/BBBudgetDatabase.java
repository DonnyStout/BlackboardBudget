package edu.cnm.deepdive.blackboardbudget.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import edu.cnm.deepdive.blackboardbudget.coverters.DateTypeConverter;
import edu.cnm.deepdive.blackboardbudget.models.Budget;
import edu.cnm.deepdive.blackboardbudget.models.Transaction;
import edu.cnm.deepdive.blackboardbudget.models.TransactionType;
import edu.cnm.deepdive.blackboardbudget.models.User;

@Database(entities = {User.class, Budget.class, Transaction.class, TransactionType.class},
    version = 1, exportSchema = true)
@TypeConverters({DateTypeConverter.class})
public abstract class BBBudgetDatabase extends RoomDatabase {




}
