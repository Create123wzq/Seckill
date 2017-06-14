package wzq.seckill.dao;

import org.apache.ibatis.annotations.Param;
import wzq.seckill.entity.Seckill;
import wzq.seckill.entity.SuccessKilled;

/**
 * Created by apple on 2017/6/13.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param(value = "seckillId")long seckillId, @Param(value = "userPhone")long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param(value = "seckillId")long seckillId, @Param(value = "userPhone")long userPhone);

}
