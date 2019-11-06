package project_one.My_shop.dao;
 
import java.util.List;
 
import project_one.My_shop.model.CartInfo;
import project_one.My_shop.model.OrderDetailInfo;
import project_one.My_shop.model.OrderInfo;
import project_one.My_shop.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}