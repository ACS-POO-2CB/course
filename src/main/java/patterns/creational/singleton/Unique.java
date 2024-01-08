package patterns.creational.singleton;

public class Unique { // eg config, connec pool,
   private static Unique INSTANCE;// = new Unique(); // eager
   private String setting;

   private Unique() {
      readSettings();
   }

   public static Unique getInstance() {
      if (INSTANCE == null) {
         INSTANCE = new Unique();
      }
      return INSTANCE;
   }

   private void readSettings() {
      // Smart read from DB
      System.out.println("Our only instance is being initialized...");
      setting = "Read from DB";
   }

   public String getSetting() {
      return setting;
   }
}
