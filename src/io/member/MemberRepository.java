package io.member;

import java.util.List;

/**
 * Member Repository
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public interface MemberRepository {
	void add(Member member);

	List<Member> findAll();
}