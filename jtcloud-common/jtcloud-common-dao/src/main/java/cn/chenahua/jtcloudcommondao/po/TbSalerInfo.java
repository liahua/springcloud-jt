package cn.chenahua.jtcloudcommondao.po;

public class TbSalerInfo {
    private Long salerId;

    private String salerName;

    private String salerLogo;

    private String salerDesc;

    public Long getSalerId() {
        return salerId;
    }

    public void setSalerId(Long salerId) {
        this.salerId = salerId;
    }

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName == null ? null : salerName.trim();
    }

    public String getSalerLogo() {
        return salerLogo;
    }

    public void setSalerLogo(String salerLogo) {
        this.salerLogo = salerLogo == null ? null : salerLogo.trim();
    }

    public String getSalerDesc() {
        return salerDesc;
    }

    public void setSalerDesc(String salerDesc) {
        this.salerDesc = salerDesc == null ? null : salerDesc.trim();
    }
}