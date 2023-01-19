package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void NextRadioStation() {
        Radio setup = new Radio();

        setup.setNextRadioStation(5);

        int expected = 6;
        int actual = setup.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMaxRadioStation() {
        Radio setup = new Radio();

        setup.setNextRadioStation(9);

        int expected = 0;
        int actual = setup.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseNextMaxRadioStation() {
        Radio setup = new Radio();

        setup.setNextRadioStation(10);

        int expected = 0;
        int actual = setup.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevRadioStation() {
        Radio setup = new Radio();

        setup.setPrevRadioStation(6);

        int expected = 5;
        int actual = setup.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreasePrevRadioStation() {
        Radio setup = new Radio();

        setup.setPrevRadioStation(0);

        int expected = 9;
        int actual = setup.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToMiddleRadioStation() {
        Radio setup = new Radio();

        setup.setToRadioStation(5);

        int expected = 5;
        int actual = setup.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToMinBorderRadioStation() {
        Radio setup = new Radio();

        setup.setToRadioStation(-1);

        int expected = 0;
        int actual = setup.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToMaxBorderRadioStation() {
        Radio setup = new Radio();

        setup.setToRadioStation(10);

        int expected = 0;
        int actual = setup.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void IncreaseVolume() {
        Radio setup = new Radio();

        setup.setIncreaseVolume(5);

        int expected = 6;
        int actual = setup.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void IncreaseMaxVolume() {
        Radio setup = new Radio();

        setup.setIncreaseVolume(10);

        int expected = 10;
        int actual = setup.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void OverMaxVolume() {
        Radio setup = new Radio();

        setup.setIncreaseVolume(11);

        int expected = 10;
        int actual = setup.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void DecreaseVolume() {
        Radio setup = new Radio();

        setup.setDecreaseVolume(5);

        int expected = 4;
        int actual = setup.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void DecreaseMinVolume() {
        Radio setup = new Radio();

        setup.setDecreaseVolume(0);

        int expected = 0;
        int actual = setup.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

