package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="lib_table")
@NoArgsConstructor
@NamedQueries({
@NamedQuery(name = "updateByName", query = "update LibraryDTO lr set lr.bookAuthor=:bookAuthor where lr.bookName=:bookName"),
@NamedQuery(name = "selectAll", query = "from LibraryDTO lr ")})
@Getter
@Setter
@ToString
public class LibraryDTO {
	@Id
	@Column(name="book_id")
	private Integer bookId;
	@Column(name="book_name")
	private String bookName;
	@Column(name="book_price")
	private Double  price;
	@Column(name="book_author")
	private String bookAuthor;
}
