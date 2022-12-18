package io.github.jagodevreede.semver.check.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyExampleClass {
   private final static Logger log = Logger.getLogger(MyExampleClass.class.getName());

   public boolean doImportantStuff() {
      log.log(Level.FINER, "Done with important stuff");

      return true;
   }

}
