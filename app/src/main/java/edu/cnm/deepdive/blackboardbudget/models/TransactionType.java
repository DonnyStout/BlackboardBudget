package edu.cnm.deepdive.blackboardbudget.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = Transaction.class,
    parentColumns = "transaction_id",
    childColumns = "transaction_id"),
    @ForeignKey(entity = Type.class,
        parentColumns = "type_id",
        childColumns = "type_id")})
public class TransactionType {

  @PrimaryKey
  @ColumnInfo(name = "transaction_type_id")
  private long transactionTypeId;

  @ColumnInfo(name = "transaction_id")
  private long transactionId;

  @ColumnInfo(name = "type_id")
  private long typeId;

  public long getTransactionTypeId() {
    return transactionTypeId;
  }

  public void setTransactionTypeId(long transactionTypeId) {
    this.transactionTypeId = transactionTypeId;
  }

  public long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(long transactionId) {
    this.transactionId = transactionId;
  }

  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }
}
