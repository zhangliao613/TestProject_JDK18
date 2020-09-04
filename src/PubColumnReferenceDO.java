
import java.io.Serializable;

/**
 * 数据对象
 * @since 2013-03-04
 */
public class PubColumnReferenceDO implements Serializable {

    private static final long serialVersionUID = 136238019333793631L;

    /**
     * column PUB_COLUMN_REFERENCE.REFER_ID
     */
    private Integer referId;

    /**
     * column PUB_COLUMN_REFERENCE.TABLE_CODE
     */
    private String tableCode;

    /**
     * column PUB_COLUMN_REFERENCE.COL_CODE
     */
    private String colCode;

    /**
     * column PUB_COLUMN_REFERENCE.COL_NAME
     */
    private String colName;

    /**
     * column PUB_COLUMN_REFERENCE.COL_VALUE
     */
    private String colValue;

    /**
     * column PUB_COLUMN_REFERENCE.COL_VALUE_NAME
     */
    private String colValueName;

    /**
     * column PUB_COLUMN_REFERENCE.COL_ORDER
     */
    private Integer colOrder;

    /**
     * column PUB_COLUMN_REFERENCE.REMARK
     */
    private String remark;

    public PubColumnReferenceDO() {
        super();
    }

    public PubColumnReferenceDO(Integer referId, String tableCode, String colCode, String colName, String colValue, String colValueName, Integer colOrder, String remark) {
        this.referId = referId;
        this.tableCode = tableCode;
        this.colCode = colCode;
        this.colName = colName;
        this.colValue = colValue;
        this.colValueName = colValueName;
        this.colOrder = colOrder;
        this.remark = remark;
    }

    /**
     * getter for Column PUB_COLUMN_REFERENCE.REFER_ID
     */
    public Integer getReferId() {
        return referId;
    }

    /**
     * setter for Column PUB_COLUMN_REFERENCE.REFER_ID
     * @param referId
     */
    public void setReferId(Integer referId) {
        this.referId = referId;
    }

    /**
     * getter for Column PUB_COLUMN_REFERENCE.TABLE_CODE
     */
    public String getTableCode() {
        return tableCode;
    }

    /**
     * setter for Column PUB_COLUMN_REFERENCE.TABLE_CODE
     * @param tableCode
     */
    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    /**
     * getter for Column PUB_COLUMN_REFERENCE.COL_CODE
     */
    public String getColCode() {
        return colCode;
    }

    /**
     * setter for Column PUB_COLUMN_REFERENCE.COL_CODE
     * @param colCode
     */
    public void setColCode(String colCode) {
        this.colCode = colCode;
    }

    /**
     * getter for Column PUB_COLUMN_REFERENCE.COL_NAME
     */
    public String getColName() {
        return colName;
    }

    /**
     * setter for Column PUB_COLUMN_REFERENCE.COL_NAME
     * @param colName
     */
    public void setColName(String colName) {
        this.colName = colName;
    }

    /**
     * getter for Column PUB_COLUMN_REFERENCE.COL_VALUE
     */
    public String getColValue() {
        return colValue;
    }

    /**
     * setter for Column PUB_COLUMN_REFERENCE.COL_VALUE
     * @param colValue
     */
    public void setColValue(String colValue) {
        this.colValue = colValue;
    }

    /**
     * getter for Column PUB_COLUMN_REFERENCE.COL_VALUE_NAME
     */
    public String getColValueName() {
        return colValueName;
    }

    /**
     * setter for Column PUB_COLUMN_REFERENCE.COL_VALUE_NAME
     * @param colValueName
     */
    public void setColValueName(String colValueName) {
        this.colValueName = colValueName;
    }

    /**
     * getter for Column PUB_COLUMN_REFERENCE.COL_ORDER
     */
    public Integer getColOrder() {
        return colOrder;
    }

    /**
     * setter for Column PUB_COLUMN_REFERENCE.COL_ORDER
     * @param colOrder
     */
    public void setColOrder(Integer colOrder) {
        this.colOrder = colOrder;
    }

    /**
     * getter for Column PUB_COLUMN_REFERENCE.REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * setter for Column PUB_COLUMN_REFERENCE.REMARK
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

}