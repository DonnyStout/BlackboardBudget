package edu.cnm.deepdive.blackboardbudget.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import edu.cnm.deepdive.blackboardbudget.coverters.DateTypeConverter;
import edu.cnm.deepdive.blackboardbudget.dao.BudgetDao;
import edu.cnm.deepdive.blackboardbudget.dao.BudgetTypeDao;
import edu.cnm.deepdive.blackboardbudget.dao.ExpenseDao;
import edu.cnm.deepdive.blackboardbudget.dao.TransactionDao;
import edu.cnm.deepdive.blackboardbudget.dao.TypeDao;
import edu.cnm.deepdive.blackboardbudget.dao.UserDao;
import edu.cnm.deepdive.blackboardbudget.models.Budget;
import edu.cnm.deepdive.blackboardbudget.models.BudgetType;
import edu.cnm.deepdive.blackboardbudget.models.Expense;
import edu.cnm.deepdive.blackboardbudget.models.ExpenseType;
import edu.cnm.deepdive.blackboardbudget.models.Transaction;
import edu.cnm.deepdive.blackboardbudget.models.TransactionType;
import edu.cnm.deepdive.blackboardbudget.models.Type;
import edu.cnm.deepdive.blackboardbudget.models.User;

@Database(entities = {User.class, Budget.class, Transaction.class, TransactionType.class,
    Type.class, Expense.class, BudgetType.class, ExpenseType.class},
    version = 1, exportSchema = true)
@TypeConverters({DateTypeConverter.class})
public abstract class BBBudgetDatabase extends RoomDatabase {


public abstract BudgetDao budgetDao();
public abstract BudgetTypeDao budgetTypeDao();
public abstract ExpenseDao expenseDao();
public abstract TransactionDao transactionDao();
public abstract TypeDao typeDao();
public abstract UserDao userDao();

}
