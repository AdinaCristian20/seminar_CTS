package tests;

import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GrupaFixtureTests.class, SuitaTeste.class, TestGrupa.class, TestGrupaWithDUmmy.class })

public class SuitaCustom {

}
