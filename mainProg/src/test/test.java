import org.junit.Assert;
import start.configuration.Run;

/**
 * Created by Michał on 2015-04-23.
 */
public class test {
    @org.junit.Test
    public void testName() throws Exception {
        Run run = new Run();
        Assert.assertNotNull(run.Konf);
    }
}
