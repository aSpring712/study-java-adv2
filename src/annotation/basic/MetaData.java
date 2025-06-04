package annotation.basic;

/**
 * Meta Data
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
@AnnoMeta // 타입에 적용
public class MetaData {

//	@AnnoMeta // 필드에 적용 - 컴파일 오류
	private String id;

	@AnnoMeta // 메서드에 적용
	public void call() {

	}

	public static void main(String[] args) throws NoSuchMethodException {
		AnnoMeta typeAnno = MetaData.class.getAnnotation(AnnoMeta.class);
		System.out.println("typeAnno = " + typeAnno);

		AnnoMeta methodAnno = MetaData.class.getMethod("call").getAnnotation(AnnoMeta.class);
		System.out.println("methodAnno = " + methodAnno);
	}
}