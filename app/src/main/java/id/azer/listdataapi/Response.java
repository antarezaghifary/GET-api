
package id.azer.listdataapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("arti")
    @Expose
    private String arti;
    @SerializedName("asma")
    @Expose
    private String asma;
    @SerializedName("ayat")
    @Expose
    private Integer ayat;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("urut")
    @Expose
    private String urut;
    @SerializedName("audio")
    @Expose
    private String audio;
    @SerializedName("nomor")
    @Expose
    private String nomor;
    @SerializedName("rukuk")
    @Expose
    private String rukuk;
    @SerializedName("keterangan")
    @Expose
    private String keterangan;

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    public String getAsma() {
        return asma;
    }

    public void setAsma(String asma) {
        this.asma = asma;
    }

    public Integer getAyat() {
        return ayat;
    }

    public void setAyat(Integer ayat) {
        this.ayat = ayat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrut() {
        return urut;
    }

    public void setUrut(String urut) {
        this.urut = urut;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getRukuk() {
        return rukuk;
    }

    public void setRukuk(String rukuk) {
        this.rukuk = rukuk;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

}
