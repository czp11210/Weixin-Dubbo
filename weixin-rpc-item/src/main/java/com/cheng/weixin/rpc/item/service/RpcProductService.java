package com.cheng.weixin.rpc.item.service;

import com.cheng.weixin.rpc.item.entity.Picture;
import com.cheng.weixin.rpc.item.entity.Product;
import com.cheng.weixin.rpc.item.entity.ProductType;

import java.util.List;

/**
 * Desc: 商品
 * Author: cheng
 * Date: 2016/6/28
 */
public interface RpcProductService {

    /**
     * 根据ID获取商品
     * @param id
     * @return
     */
    Product getById(String id);

    /**
     * 更新商品库存信息
     * @param id
     * @param stock
     * @param isBack 是否是后端
     */
    void updateStockById(String id, int stock, boolean isBack);

    /**
     * 根据类型ID获取图片
     * @param typeId
     * @return
     */
    List<Product> getByTypeId(String typeId);

    /**
     * 根据ID获取商品和默认图片
     * @param id
     * @return
     */
    Product getDefaultPictureById(String id);

    /**
     * 获取首页的商品
     * @return
     */
    List<Product> getIndex();

    /**
     * 获取全部的商品类型
     * @return
     */
    List<ProductType> getProductType();

    /**
     * 获取该商品全部图片
     * @param productId
     * @return
     */
    List<Picture> getAllPicture(String productId);

    /**
     * 获取商品默认的图片
     * @param productId
     * @return
     */
    Picture getDefaultPictureByProductId(String productId);

    /**
     * 获取该商品的所有的轮播图
     * @param productId
     * @return
     */
    List<Picture> getShowPictureByProductId(String productId);

}
