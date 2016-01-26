package jp.kk_brain.smphone.works.db.entities;

import java.io.Serializable;

import com.iciql.Iciql.IQColumn;
import com.iciql.Iciql.IQTable;

/**
 * 会社Ｍ
 * @author KAMIYA.Atsuteru <kamiya@kk-brain.jp>
 */
@IQTable(name="KAISHAM")
public class Kaisham implements Serializable{

	/**
	 * シリアライズバージョン
	 */
	private static final long serialVersionUID = -1416093735571305361L;

	/**
	 * 会社ＣＤ
	 */
	@IQColumn(primaryKey=true, nullable=false)
	public Integer kikaishacd;

	/**
	 * 会社名
	 */
	@IQColumn(length=256, nullable=false)
	public String kikaishamei;
	
	/**
	 * インスタンスの文字列表現を取得する
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kaisham");
		builder.append("[ kikaishacd=" + kikaishacd);
		builder.append(", kikaishamei=" + kikaishamei);
		builder.append("]");
		return builder.toString();
	};
}
