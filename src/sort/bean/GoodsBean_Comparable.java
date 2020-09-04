package sort.bean;

public class GoodsBean_Comparable implements Comparable {
	public String id;
	public String goodsName;
	public Integer salesCount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(Integer salesCount) {
		this.salesCount = salesCount;
	}
	
	@Override
    public int compareTo(Object obj)
    {
		GoodsBean_Comparable goodBean = (GoodsBean_Comparable) obj;
		return this.getSalesCount().compareTo(goodBean.getSalesCount());
    }

}
