package edu.cnm.deepdive.blackboardbudget.coverters;

import android.arch.persistence.room.TypeConverter;
import org.joda.time.LocalDate;

public class DateTypeConverter {


  @TypeConverter
  public static LocalDate toLocalDate(String value) {
    return value == null ? null : LocalDate.parse(value);
  }


  @TypeConverter
  public static String toString(LocalDate value) {
    return value == null ? null : value.toString();
  }
}
