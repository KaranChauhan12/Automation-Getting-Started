package org.automation.UnitTests;

import org.automation.core.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 8/23/16.
 */
@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "calculator.csv", loaderType = LoaderType.CSV)
public class ReportingExamples extends DataDrivenTest{

    @Test
    public void testAddFromCSV(@Param(name = "a") Double a,
                               @Param(name = "b") Double b,
                               @Param(name = "expected") Double expected) {

        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }


}
