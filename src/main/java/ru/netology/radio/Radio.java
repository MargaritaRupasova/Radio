package ru.netology.radio;

public class Radio {

    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setNextRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 9) {
            newCurrentRadioStation = newCurrentRadioStation + 1;
        }

        if (newCurrentRadioStation >= 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setPrevRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 0) {
            if (newCurrentRadioStation < 9) {
                newCurrentRadioStation = newCurrentRadioStation - 1;
            }
        }
        if (newCurrentRadioStation <= 0) {
            newCurrentRadioStation = 9;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setToRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;

    }

    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            newCurrentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume >= 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;

    }

    public void setDecreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            if (newCurrentVolume < 11) {
                newCurrentVolume = newCurrentVolume - 1;
            }
        }
        if (newCurrentVolume <= 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}
