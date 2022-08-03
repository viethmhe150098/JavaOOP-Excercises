package entity;

public class Certificate {
    private int certificateID;
    private String certificateName;
    private int certificateRank;
    private String certificateDate;

    public Certificate() {
    }

    public Certificate(int certificateID, String certificateName, int certificateRank, String certificateDate) {
        this.certificateID = certificateID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public int getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(int certificateRank) {
        this.certificateRank = certificateRank;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }
}
