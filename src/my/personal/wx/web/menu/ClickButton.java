package my.personal.wx.web.menu;

/*
 * Click类型的Button
 */
public class ClickButton extends Button{
	//菜单KEY值，用于消息接口推送，不超过128字节
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
