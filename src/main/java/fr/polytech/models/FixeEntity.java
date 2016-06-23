package fr.polytech.models;

/**
 * @author ROCHE Gaetan & PLATTEAU Jonathan
 */
public class FixeEntity {
    private int nummission;
    private int numobjectif;
    private ObjectifEntity objectifByNumobjectif;
    private MissionEntity missionByNummission;

    public int getNummission() {
        return nummission;
    }

    public void setNummission(int nummission) {
        this.nummission = nummission;
    }

    public int getNumobjectif() {
        return numobjectif;
    }

    public void setNumobjectif(int numobjectif) {
        this.numobjectif = numobjectif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FixeEntity that = (FixeEntity) o;

        if (nummission != that.nummission) return false;
        if (numobjectif != that.numobjectif) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nummission;
        result = 31 * result + numobjectif;
        return result;
    }

    public ObjectifEntity getObjectifByNumobjectif() {
        return objectifByNumobjectif;
    }

    public void setObjectifByNumobjectif(ObjectifEntity objectifByNumobjectif) {
        this.objectifByNumobjectif = objectifByNumobjectif;
    }

    public MissionEntity getMissionByNummission() {
        return missionByNummission;
    }

    public void setMissionByNummission(MissionEntity missionByNummission) {
        this.missionByNummission = missionByNummission;
    }
}
