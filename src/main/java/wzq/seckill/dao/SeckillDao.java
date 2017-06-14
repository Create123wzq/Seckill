package wzq.seckill.dao;

import org.apache.ibatis.annotations.Param;
import wzq.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by apple on 2017/6/13.
 */
public interface SeckillDao {
    /**
     * 减库存,
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumer(@Param(value = "seckillId")long seckillId, @Param(value = "killTime")Date killTime);

    /**
     *根据id查询商品,
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     *根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param(value = "offset") int offset, @Param(value = "limit")int limit);
}

