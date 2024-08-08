-- name: GetCourses :many
SELECT
    "course_id",
    "code",
    "name",
    "workload",
    "department",
    "program",
    "objective",
    "content",
    "bibliography",
    "created_at",
    "updated_at"
FROM
    "courses"
ORDER BY
    "name" ASC;