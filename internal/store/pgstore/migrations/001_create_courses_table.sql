-- Write your migrate up statements here

CREATE TABLE IF NOT EXISTS courses (
	course_id serial4 PRIMARY KEY NOT NULL,
	code varchar(8) NOT NULL,
	name varchar(100) NOT NULL,
	workload int4 NOT NULL,
	department varchar(60) NOT NULL,
	program text NULL,
	objective text NULL,
	content text NULL,
	bibliography text NULL,
	created_at timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	updated_at timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,

	UNIQUE(code)
);

---- create above / drop below ----
DROP TABLE IF EXISTS courses;

-- Write your migrate down statements here. If this migration is irreversible
-- Then delete the separator line above.
