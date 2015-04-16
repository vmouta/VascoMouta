/**
 * Category.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkahlert.wpws.model;

public class Category  implements java.io.Serializable {
    private int termId;

    private java.lang.String name;

    private java.lang.String slug;

    private java.lang.String termGroup;

    private java.lang.String termTaxonomyId;

    private java.lang.String taxonomy;

    private java.lang.String description;

    private int parentId;

    private int count;

    private int catId;

    private int categoryCount;

    private java.lang.String categoryDescription;

    private java.lang.String categoryName;

    private java.lang.String categoryNicename;

    private int categoryParent;

    public Category() {
    }

    public Category(
           int termId,
           java.lang.String name,
           java.lang.String slug,
           java.lang.String termGroup,
           java.lang.String termTaxonomyId,
           java.lang.String taxonomy,
           java.lang.String description,
           int parentId,
           int count,
           int catId,
           int categoryCount,
           java.lang.String categoryDescription,
           java.lang.String categoryName,
           java.lang.String categoryNicename,
           int categoryParent) {
           this.termId = termId;
           this.name = name;
           this.slug = slug;
           this.termGroup = termGroup;
           this.termTaxonomyId = termTaxonomyId;
           this.taxonomy = taxonomy;
           this.description = description;
           this.parentId = parentId;
           this.count = count;
           this.catId = catId;
           this.categoryCount = categoryCount;
           this.categoryDescription = categoryDescription;
           this.categoryName = categoryName;
           this.categoryNicename = categoryNicename;
           this.categoryParent = categoryParent;
    }


    /**
     * Gets the termId value for this Category.
     * 
     * @return termId
     */
    public int getTermId() {
        return termId;
    }


    /**
     * Sets the termId value for this Category.
     * 
     * @param termId
     */
    public void setTermId(int termId) {
        this.termId = termId;
    }


    /**
     * Gets the name value for this Category.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Category.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the slug value for this Category.
     * 
     * @return slug
     */
    public java.lang.String getSlug() {
        return slug;
    }


    /**
     * Sets the slug value for this Category.
     * 
     * @param slug
     */
    public void setSlug(java.lang.String slug) {
        this.slug = slug;
    }


    /**
     * Gets the termGroup value for this Category.
     * 
     * @return termGroup
     */
    public java.lang.String getTermGroup() {
        return termGroup;
    }


    /**
     * Sets the termGroup value for this Category.
     * 
     * @param termGroup
     */
    public void setTermGroup(java.lang.String termGroup) {
        this.termGroup = termGroup;
    }


    /**
     * Gets the termTaxonomyId value for this Category.
     * 
     * @return termTaxonomyId
     */
    public java.lang.String getTermTaxonomyId() {
        return termTaxonomyId;
    }


    /**
     * Sets the termTaxonomyId value for this Category.
     * 
     * @param termTaxonomyId
     */
    public void setTermTaxonomyId(java.lang.String termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }


    /**
     * Gets the taxonomy value for this Category.
     * 
     * @return taxonomy
     */
    public java.lang.String getTaxonomy() {
        return taxonomy;
    }


    /**
     * Sets the taxonomy value for this Category.
     * 
     * @param taxonomy
     */
    public void setTaxonomy(java.lang.String taxonomy) {
        this.taxonomy = taxonomy;
    }


    /**
     * Gets the description value for this Category.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Category.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the parentId value for this Category.
     * 
     * @return parentId
     */
    public int getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this Category.
     * 
     * @param parentId
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the count value for this Category.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this Category.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the catId value for this Category.
     * 
     * @return catId
     */
    public int getCatId() {
        return catId;
    }


    /**
     * Sets the catId value for this Category.
     * 
     * @param catId
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }


    /**
     * Gets the categoryCount value for this Category.
     * 
     * @return categoryCount
     */
    public int getCategoryCount() {
        return categoryCount;
    }


    /**
     * Sets the categoryCount value for this Category.
     * 
     * @param categoryCount
     */
    public void setCategoryCount(int categoryCount) {
        this.categoryCount = categoryCount;
    }


    /**
     * Gets the categoryDescription value for this Category.
     * 
     * @return categoryDescription
     */
    public java.lang.String getCategoryDescription() {
        return categoryDescription;
    }


    /**
     * Sets the categoryDescription value for this Category.
     * 
     * @param categoryDescription
     */
    public void setCategoryDescription(java.lang.String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    /**
     * Gets the categoryName value for this Category.
     * 
     * @return categoryName
     */
    public java.lang.String getCategoryName() {
        return categoryName;
    }


    /**
     * Sets the categoryName value for this Category.
     * 
     * @param categoryName
     */
    public void setCategoryName(java.lang.String categoryName) {
        this.categoryName = categoryName;
    }


    /**
     * Gets the categoryNicename value for this Category.
     * 
     * @return categoryNicename
     */
    public java.lang.String getCategoryNicename() {
        return categoryNicename;
    }


    /**
     * Sets the categoryNicename value for this Category.
     * 
     * @param categoryNicename
     */
    public void setCategoryNicename(java.lang.String categoryNicename) {
        this.categoryNicename = categoryNicename;
    }


    /**
     * Gets the categoryParent value for this Category.
     * 
     * @return categoryParent
     */
    public int getCategoryParent() {
        return categoryParent;
    }


    /**
     * Sets the categoryParent value for this Category.
     * 
     * @param categoryParent
     */
    public void setCategoryParent(int categoryParent) {
        this.categoryParent = categoryParent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Category)) return false;
        Category other = (Category) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.termId == other.getTermId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.slug==null && other.getSlug()==null) || 
             (this.slug!=null &&
              this.slug.equals(other.getSlug()))) &&
            ((this.termGroup==null && other.getTermGroup()==null) || 
             (this.termGroup!=null &&
              this.termGroup.equals(other.getTermGroup()))) &&
            ((this.termTaxonomyId==null && other.getTermTaxonomyId()==null) || 
             (this.termTaxonomyId!=null &&
              this.termTaxonomyId.equals(other.getTermTaxonomyId()))) &&
            ((this.taxonomy==null && other.getTaxonomy()==null) || 
             (this.taxonomy!=null &&
              this.taxonomy.equals(other.getTaxonomy()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.parentId == other.getParentId() &&
            this.count == other.getCount() &&
            this.catId == other.getCatId() &&
            this.categoryCount == other.getCategoryCount() &&
            ((this.categoryDescription==null && other.getCategoryDescription()==null) || 
             (this.categoryDescription!=null &&
              this.categoryDescription.equals(other.getCategoryDescription()))) &&
            ((this.categoryName==null && other.getCategoryName()==null) || 
             (this.categoryName!=null &&
              this.categoryName.equals(other.getCategoryName()))) &&
            ((this.categoryNicename==null && other.getCategoryNicename()==null) || 
             (this.categoryNicename!=null &&
              this.categoryNicename.equals(other.getCategoryNicename()))) &&
            this.categoryParent == other.getCategoryParent();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getTermId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSlug() != null) {
            _hashCode += getSlug().hashCode();
        }
        if (getTermGroup() != null) {
            _hashCode += getTermGroup().hashCode();
        }
        if (getTermTaxonomyId() != null) {
            _hashCode += getTermTaxonomyId().hashCode();
        }
        if (getTaxonomy() != null) {
            _hashCode += getTaxonomy().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getParentId();
        _hashCode += getCount();
        _hashCode += getCatId();
        _hashCode += getCategoryCount();
        if (getCategoryDescription() != null) {
            _hashCode += getCategoryDescription().hashCode();
        }
        if (getCategoryName() != null) {
            _hashCode += getCategoryName().hashCode();
        }
        if (getCategoryNicename() != null) {
            _hashCode += getCategoryNicename().hashCode();
        }
        _hashCode += getCategoryParent();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Category.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "Category"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "termId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slug");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "slug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "termGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termTaxonomyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "termTaxonomyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxonomy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "taxonomy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "catId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "categoryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "categoryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "categoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryNicename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "categoryNicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryParent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.bkahlert.com", "categoryParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
