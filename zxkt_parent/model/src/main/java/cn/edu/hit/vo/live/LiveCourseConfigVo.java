package cn.edu.hit.vo.live;

import com.atguigu.ggkt.model.live.LiveCourseConfig;
import com.atguigu.ggkt.model.live.LiveCourseGoods;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "LiveCourseConfig")
public class LiveCourseConfigVo extends LiveCourseConfig {

	@ApiModelProperty(value = "ๅๅๅ่กจ")
	private List<LiveCourseGoods> liveCourseGoodsList;
}