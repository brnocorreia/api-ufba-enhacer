DROP TABLE IF EXISTS courses_disciplines;

CREATE TABLE relations (
    course_id INTEGER NOT NULL,
    discipline_id INTEGER NOT NULL,
    relation_type VARCHAR(2) NOT NULL,

    PRIMARY KEY (course_id, discipline_id),
    FOREIGN KEY (course_id) REFERENCES courses (course_id),
    FOREIGN KEY (discipline_id) REFERENCES disciplines (discipline_id)
);
