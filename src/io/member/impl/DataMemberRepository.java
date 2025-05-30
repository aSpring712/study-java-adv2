package io.member.impl;

import io.member.Member;
import io.member.MemberRepository;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Member Repository
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public class DataMemberRepository implements MemberRepository {

	private static final String FILE_PATH = "temp/members-data.dat";

	@Override
	public void add(Member member) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_PATH, true))) {
			dos.writeUTF(member.getId());
			dos.writeUTF(member.getName());
			dos.writeInt(member.getAge());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Member> findAll() {
		List<Member> members = new ArrayList<>();
		try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_PATH))) {
			while (dis.available() > 0) {
				members.add(new Member(dis.readUTF(), dis.readUTF(), dis.readInt()));
			}
			return members;
		} catch (FileNotFoundException e) {
			return new ArrayList<>();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}