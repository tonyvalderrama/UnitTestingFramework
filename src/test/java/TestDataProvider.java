import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDataProvider {

    public Object[][] csvFileToObj3Columns(String fileName) throws IOException {
        String filePath = "src/test/resources/" + fileName + ".csv";
        List<Object[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                double a = Double.parseDouble(parts[0]);
                double b = Double.parseDouble(parts[1]);
                double result = Double.parseDouble(parts[2]);
                data.add(new Object[]{a, b, result});
            }
        }

        return data.toArray(new Object[0][]);
    }

    public Object[][] csvFileToObj2Columns(String fileName) throws IOException {
        String filePath = "src/test/resources/" + fileName + ".csv";
        List<Object[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                double a = Double.parseDouble(parts[0]);
                double result = Double.parseDouble(parts[1]);
                data.add(new Object[]{a, result});
            }
        }

        return data.toArray(new Object[0][]);
    }

    @DataProvider
    Object[][] sumDataLong() {
        Long[][] returnData = new Long[5][3];
        returnData[0][0] = 0L;      returnData[0][1] = 99L;     returnData[0][2] = 99L;
        returnData[1][0] = Long.MAX_VALUE - 2;      returnData[1][1] = 2L;     returnData[1][2] = Long.MAX_VALUE;
        returnData[2][0] = 3L;      returnData[2][1] = 2L;      returnData[2][2] = 5L;
        returnData[3][0] = 10L;     returnData[3][1] = -65L;    returnData[3][2] = -55L;
        returnData[4][0] = 55L;      returnData[4][1] = -15L;     returnData[4][2] = 40L;
        return returnData;
    }

    @DataProvider
    public Object[][] sumDataDouble() {
        return new Object[][] {
                { 12.5, 8.3, 20.8 },
                { 0.5, 2.2, 2.7 },
                { 10.0, 20.5, 30.5 },
                { 7.77, 3.14, 10.91 },
                { 100.25, 200.75, 301.00 }
        };
    }

    @DataProvider
    public Object[][] subtractionDataLong() {
        return new Object[][] {
                { 10L, 5L, 5L },
                { -4L, 6L, -10L },
                { 7L, -2L, 9L },
                { -8L, -3L, -5L },
                { 0L, 9L, -9L },
                { 12L, 0L, 12L }
        };
    }

    @DataProvider
    public Object[][] subtractionDataDouble() {
        return new Object[][] {
                { 12.5, 8.3, 4.2 },
                { -5.0, 3.0, -8.0 },
                { 10.0, -2.5, 12.5 },
                { -7.77, -3.14, -4.63 },
                { 0.0, 4.5, -4.5 }
        };
    }

    @DataProvider
    public Object[][] multiplicationDataLong() {
        return new Object[][] {
                { 5L, 3L, 15L },
                { -4L, 6L, -24L },
                { 7L, -2L, -14L },
                { -8L, -3L, 24L },
                { 0L, 9L, 0L },
                { 12L, 0L, 0L }
        };
    }

    @DataProvider
    public Object[][] multiplicationDataDouble() {
        return new Object[][] {
                { 12.5, 8.3, 103.0 },
                { 0.5, 2.2, 1.0 },
                { 10.0, 20.5, 205.0 },
                { 7.77, 3.14, 24.0 },
                { 100.25, 200.75, 20125.0 }
        };
    }

    @DataProvider
    public Object[][] divisionDataLong() {
        return new Object[][] {
                { 12L, 3L, 4L },
                { -9L, 3L, -3L },
                { 10L, -2L, -5L },
                { -8L, -2L, 4L },
                { 15L, 4L, 3L }
        };
    }

    @DataProvider
    public Object[][] divisionDataDouble() {
        return new Object[][] {
                { 12.5, 2.5, 5.0 },
                { -9.0, 3.0, -3.0 },
                { 10.0, -2.0, -5.0 },
                { -8.4, -2.1, 4.0 },
                { 7.5, 0.5, 15.0 }
        };
    }

    @DataProvider
    public Object[][] powData() throws IOException {
        return csvFileToObj3Columns("powDoubleData");
    }

    @DataProvider
    public Object[][] sqrtData() throws IOException {
        return csvFileToObj2Columns("sqrtData");
    }
}
