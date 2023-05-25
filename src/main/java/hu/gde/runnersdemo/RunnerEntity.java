package hu.gde.runnersdemo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RunnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long runnerId;
    private String runnerName;
    private long averagePace;

    private long height;

    @OneToMany(mappedBy = "runner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LapTimeEntity> laptimes = new ArrayList<>();

    @ManyToOne
    private SponsorEntity sponsor;

    public RunnerEntity() {
    }

    public long getRunnerId() {
        return runnerId;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public long getAveragePace() {
        return averagePace;
    }

    public void setRunnerId(long runnerId) {
        this.runnerId = runnerId;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public void setAveragePace(long averagePace) {
        this.averagePace = averagePace;
    }

    public long getHeight() {
        return height;
    }
    public void setHeight(long height) {
        this.height = height;
    }

    public List<LapTimeEntity> getLaptimes() {
        return laptimes;
    }
}
