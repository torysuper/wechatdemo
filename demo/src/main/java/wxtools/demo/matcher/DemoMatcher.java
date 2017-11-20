package wxtools.demo.matcher;

import com.soecode.wxtools.api.WxMessageMatcher;
import com.soecode.wxtools.bean.WxXmlMessage;

/**
 * DemoMatcher匹配
 * 目的：拦截“在吗”的消息
 * 
 * @author t
 *
 */
public class DemoMatcher implements WxMessageMatcher{

	@Override
	public boolean match(WxXmlMessage message) {
		//拦截“在吗”的消息，true通行；false拦截
		if("在吗".equals(message.getContent())){
			return false;
		}
		return true;
	}
}
