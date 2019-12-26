package id.ac.ui.cs.mobileprogramming.hanifa.odoj.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.sql.Date;

@Entity(tableName = "tilawah")
@TypeConverters({DateConverter.class})
public class Tilawah {
    public Tilawah(@NonNull Date tanggal, Integer jmlHalaman) {
        this.id = id;
        this.tanggal = tanggal;
        this.jmlHalaman = jmlHalaman;
    }

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;

    @NonNull
    private Date tanggal;

    @NonNull
    private Integer jmlHalaman;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(@NonNull Date tanggal) {
        this.tanggal = tanggal;
    }

    @NonNull
    public Integer getJmlHalaman() {
        return jmlHalaman;
    }

    public void setJmlHalaman(@NonNull Integer jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
    }

}
