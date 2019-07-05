package my.personal.wx.web.menu;

/*
 * 菜单的Button
 */
public class Button {
	//响应类型
	private String type;
	//菜单标题
	private String name;
	//子菜单
	private Button[] sub_button;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Button[] getSub_button() {
		return sub_button;
	}
	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}
}
