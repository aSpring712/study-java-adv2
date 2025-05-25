package io.member.impl;

import io.member.Member;
import io.member.MemberRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Memory Member Repository
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public class MemoryMemberRepository implements MemberRepository {

	private final List<Member> members = new ArrayList<>();

	@Override
	public void add(Member member) {
		members.add(member);
	}

	@Override
	public List<Member> findAll() {
		return members;
	}
}