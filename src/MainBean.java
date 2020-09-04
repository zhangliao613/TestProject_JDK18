public class MainBean {

	/**
	 * 话务购物车Id
	 */
	private String employeeId;
    /**
	 * 商品ID
	 */
    private String goodsId;
    
    private Double goodsPrice;
    
    private Double totalGoodsPrice;
    
    private Double totalPrice;
    
    /**
	 * 订购数量
	 */
    private Integer buyNum;
    
    private Integer totalBuyNum;
    
    /**
	 * 运费
	 */
    private Double freight;
    
    private Double totalFreight;
    
	
    public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Double getTotalGoodsPrice() {
		return totalGoodsPrice;
	}

	public void setTotalGoodsPrice(Double totalGoodsPrice) {
		this.totalGoodsPrice = totalGoodsPrice;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	public Integer getTotalBuyNum() {
		return totalBuyNum;
	}

	public void setTotalBuyNum(Integer totalBuyNum) {
		this.totalBuyNum = totalBuyNum;
	}

	public Double getFreight() {
		return freight;
	}

	public void setFreight(Double freight) {
		this.freight = freight;
	}

	public Double getTotalFreight() {
		return totalFreight;
	}

	public void setTotalFreight(Double totalFreight) {
		this.totalFreight = totalFreight;
	}
	

	public void method(){
		synchronized (MainBean.class) {
			System.out.println("我是第二种类锁");
		}
	}

	public String toString() {
        return "===EmployeeId===" +this.getEmployeeId() 
    		+ "===buyNum===" + this.getBuyNum()
    		+ "===goodsPrice===" + this.getGoodsPrice()
    		+ "===totalGoodsPrice===" + this.getTotalGoodsPrice()
    		+ "===freight===" + this.getFreight()
    		+ "===totalPrice===" + this.getTotalPrice()
    		+ "===totalBuyNum===" + this.getTotalBuyNum()
    		; 
    } 
}
