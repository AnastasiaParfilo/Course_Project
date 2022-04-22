package ua.com.khai;

public class Residential extends Building {
    private Integer playground;
    private Integer malls;
    private Integer schools;
    private Integer kindergarten;

    public Integer getPlayground() {
        return playground;
    }

    public void setPlayground(Integer playground) {
        this.playground = playground;
    }

    public Integer getMalls() {
        return malls;
    }

    public void setMalls(Integer malls) {
        this.malls = malls;
    }

    public Integer getSchools() {
        return schools;
    }

    public void setSchools(Integer schools) {
        this.schools = schools;
    }

    public Integer getKindergarten() {
        return kindergarten;
    }

    public void setKindergarten(Integer kindergarten) {
        this.kindergarten = kindergarten;
    }

    public Integer costOfRent() {
        return areaOfRoom() * 10 + playground * 3 + kindergarten * 4 + schools * 5 + malls * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "Residential{" +
                "playground=" + playground +
                ", malls=" + malls +
                ", schools=" + schools +
                ", kindergarten=" + kindergarten +
                '}';
    }
}
