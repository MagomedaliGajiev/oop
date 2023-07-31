package adapter.meteo;

import java.time.LocalDateTime;

public class ST500InfoAdapter implements MeteoSensor{
    private SensorTemperature st;

    public ST500InfoAdapter(SensorTemperature st) {
        this.st = st;
    }

    @Override
    public int getId() {
        return st.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)st.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime timeStamp = LocalDateTime.of(st.year(), 7, 30, 0, 0, 0);
        timeStamp.plusDays(st.day()).plusSeconds(st.second());
        return timeStamp;
    }

}
