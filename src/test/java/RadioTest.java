import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setStationTests.csv")
    public void setStationDefaultInAllLimits(int numOfCurrentStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(numOfCurrentStation);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationDefaultInLimit() {
        Radio radio = new Radio();

        radio.nexCurrentStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationDefaultUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nexCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationDefaultInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prevCurrentStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationDefaultLowerLimit() {
        Radio radio = new Radio();

        radio.prevCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setCustomStationTests.csv")
    public void setStationCustomInAllLimits(int numOfStation, int numOfCurrentStation, int expected) {
        Radio radio = new Radio(numOfStation);

        radio.setCurrentStation(numOfCurrentStation);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStationCustomTests.csv")
    public void nextStationCustomInAllLimits(int numOfStation, int numOfCurrentStation, int expected) {
        Radio radio = new Radio(numOfStation);

        radio.setCurrentStation(numOfCurrentStation);
        radio.nexCurrentStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStationCustomTests.csv")
    public void prevStationCustomInAllLimits(int numOfStation, int numOfCurrentStation, int expected) {
        Radio radio = new Radio(numOfStation);

        radio.setCurrentStation(numOfCurrentStation);
        radio.prevCurrentStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setVolumeTests.csv")
    public void setVolumeInAllLimits(int volumeLevel, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(volumeLevel);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolumeTests.csv")
    public void increaseVolumeInAllLimits(int volumeLevel, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(volumeLevel);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/lowerVolumeTests.csv")
    public void lowerVolumeInAllLimits(int volumeLevel, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(volumeLevel);
        radio.lowerVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
