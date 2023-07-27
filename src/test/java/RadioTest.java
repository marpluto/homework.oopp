import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setStationTests.csv")
    public void setStationInAllLimits(int numOfStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(numOfStation);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

/*    @Test
    public void setStationInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationUnderLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationAboveUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }*/

    @Test
    public void nextStationInLimit() {
        Radio radio = new Radio();

        radio.nexCurrentStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nexCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prevCurrentStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLowerLimit() {
        Radio radio = new Radio();

        radio.prevCurrentStation();

        int expected = 9;
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

    /*@Test
    public void increaseVolumeLowerLimit() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }*/

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/lowerVolumeTests.csv")
    public void lowerVolumeInAllLimits(int volumeLevel, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(volumeLevel);
        radio.lowerVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    /*@Test
    public void lowerVolumeUnderLowerLimit() {
        Radio radio = new Radio();

        radio.lowerVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }*/
}
