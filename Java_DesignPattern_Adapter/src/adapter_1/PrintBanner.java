package adapter_1;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void printWeak() {
		// TODO 自動生成されたメソッド・スタブ
		showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO 自動生成されたメソッド・スタブ
		showWithAster();
	}

}
