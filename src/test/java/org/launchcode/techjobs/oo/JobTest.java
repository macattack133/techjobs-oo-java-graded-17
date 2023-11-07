package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
    Job test_job = new Job();
    Job test_job_two = new Job();
    assertNotEquals(test_job_two, test_job);
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job tester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Employer one = new Employer("ACME");
        Location two = new Location("Desert");
        PositionType three = new PositionType("Quality control");
        CoreCompetency four = new CoreCompetency("Persistence");

        assertEquals("Product tester", tester.getName());
        assertEquals(tester.getEmployer().getValue(), one.getValue());
        assertEquals(tester.getLocation().getValue(), two.getValue());
        assertEquals(tester.getPositionType().getValue(), three.getValue());
        assertEquals(tester.getCoreCompetency().getValue(), four.getValue());
        assertTrue(tester instanceof Job);
        assertTrue(one instanceof Employer);
        assertTrue(two instanceof Location);
        assertTrue(three instanceof PositionType);
        assertTrue(four instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality() {
        Job test_one = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_two = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(test_one, test_two);
    }
}
