-- Write your migrate up statements here

CREATE TABLE IF NOT EXISTS relations (
	course_id int4 PRIMARY KEY NOT NULL,
	discipline_id int4 NOT NULL,
	relation_type varchar(2) NOT NULL,

	UNIQUE(course_id, discipline_id),
	FOREIGN KEY (course_id) REFERENCES courses(course_id),
	FOREIGN KEY (discipline_id) REFERENCES disciplines(discipline_id)
);

---- create above / drop below ----

-- Write your migrate down statements here. If this migration is irreversible
-- Then delete the separator line above.
