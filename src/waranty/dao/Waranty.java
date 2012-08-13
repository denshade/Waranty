/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package waranty.dao;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lieven
 */
public class Waranty implements Serializable
{
    private Date expireDate;
    private String description;
    private List<File> attachedFiles;
    private Double price;

    public List<File> getAttachedFiles() {
        return attachedFiles;
    }

    public void setAttachedFiles(List<File> attachedFiles) {
        this.attachedFiles = attachedFiles;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Waranty other = (Waranty) obj;
        if (!Objects.equals(this.expireDate, other.expireDate)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.attachedFiles, other.attachedFiles)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.expireDate);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.attachedFiles);
        hash = 89 * hash + Objects.hashCode(this.price);
        return hash;
    }
    

    
}
