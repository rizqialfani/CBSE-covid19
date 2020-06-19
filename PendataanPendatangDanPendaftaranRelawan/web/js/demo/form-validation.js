
// Form-Validation.js
// ====================================================================
// This file should not be included in your project.
// This is just a sample how to initialize plugins or components.
//
// - ThemeOn.net -


$(document).on('nifty.ready', function() {


    // FORM VALIDATION
    // =================================================================
    // Require Bootstrap Validator
    // http://bootstrapvalidator.com/
    // =================================================================


    // FORM VALIDATION FEEDBACK ICONS
    // =================================================================
    var faIcon = {
        valid: 'fa fa-check-circle fa-lg text-success',
        invalid: 'fa fa-times-circle fa-lg',
        validating: 'fa fa-refresh'
    }

    // FORM VALIDATION ON ACCORDION
    // =================================================================
    $('#demo-bv-accordion').bootstrapValidator({
        message: 'This value is not valid',
        excluded: ':disabled',
        feedbackIcons: faIcon,
        fields: {
        nama_lengkap: {
            validators: {
                notEmpty: {
                    message: 'Nama wajib diisi dan tidak boleh kosong'
                },
                regexp: {
                    regexp: /^[A-Z\s]+$/i,
                    message: 'Nama hanya dapat terdiri dari karakter dan spasi alfabet'
                }
            }
        },
        nama_panggilan: {
            validators: {
                notEmpty: {
                    message: 'Nama panggilan wajib diisi dan tidak boleh kosong'
                },
                regexp: {
                    regexp: /^[A-Z\s]+$/i,
                    message: 'Nama panggilan hanya dapat terdiri dari karakter dan spasi alfabet'
                }
            }
        },
        nomor_handphone: {
            validators: {
                notEmpty: {
                    message: 'Nomor Hp wajib diisi dan tidak boleh kosong'
                },
                digits: {
                    message: 'Nilai hanya dapat berisi angka'
                }
            }
        },
        email: {
            validators: {
                notEmpty: {
                    message: 'Alamat email wajib diisi dan tidak boleh kosong'
                },
                emailAddress: {
                    message: 'Alamat email tidak valid'
                }
            }
        },
        nomor_identitas: {
            validators: {
                notEmpty: {
                    message: 'Nomor identitas wajib diisi dan tidak boleh kosong'
                },
                digits: {
                    message: 'Nilai hanya dapat berisi angka'
                }
            }
        },
        alamat: {
            validators: {
                notEmpty: {
                    message: 'Alamat wajib diisi dan tidak boleh kosong'
                }
            }
        },
        jenis_kelamin: {
            validators: {
                notEmpty: {
                    message: 'Jenis kelamin diperlukan'
                }
            }
        },
        kota_kelahiran: {
            validators: {
                notEmpty: {
                    message: 'Kota kelahiran wajib diisi dan tidak boleh kosong'
                }
            }
        },
        tanggal_lahir: {
            validators: {
                notEmpty: {
                    message: 'Tanggal kelahiran wajib diisi dan tidak boleh kosong'
                }
            }
        },
        status_perkawinan: {
            validators: {
                notEmpty: {
                    message: 'Status pernikawinan diperlukan'
                }
            }
        },
        golongan_darah: {
            validators: {
                notEmpty: {
                    message: 'Status pernikawinan diperlukan'
                }
            }
        },
        alamat_domisili: {
            validators: {
                notEmpty: {
                    message: 'Alamat domisili diperlukan'
                }
            }
        },
        waktu: {
            validators: {
                notEmpty: {
                    message: 'Waktu diperlukan'
                }
            }
        },
        prioritas: {
            validators: {
                notEmpty: {
                    message: 'Prioritas diperlukan'
                }
            }
        },
        pengalaman: {
            validators: {
                notEmpty: {
                    message: 'Wajib diisi'
                }
            }
        },
        'keahlian[]': {
            validators: {
                choice: {
                    min: 2,
                    max: 4,
                    message: 'Pilih 2 - 4 keahlian yang dimiliki'
                }
            }
        },
        fokus_relawan: {
            validators: {
                notEmpty: {
                    message: 'Fokus relawan diperlukan'
                }
            }
        },
        mengetahui: {
            validators: {
                notEmpty: {
                    message: 'Wajib diisi'
                }
            }
        }
        }
    }).on('status.field.bv', function(e, data) {
        var $form = $(e.target),
        validator = data.bv,
        $collapsePane = data.element.parents('.collapse'),
        colId = $collapsePane.attr('id');

        if (colId) {
        var $anchor = $('a[href="#' + colId + '"][data-toggle="collapse"]');
        var $icon = $anchor.find('i');

        // Add custom class to panel containing the field
        if (data.status == validator.STATUS_INVALID) {
            $anchor.addClass('bv-col-error');
            $icon.removeClass(faIcon.valid).addClass(faIcon.invalid);
        } else if (data.status == validator.STATUS_VALID) {
            var isValidCol = validator.isValidContainer($collapsePane);
            if (isValidCol) {
                $anchor.removeClass('bv-col-error');
            }else{
                $anchor.addClass('bv-col-error');
            }
            $icon.removeClass(faIcon.valid + " " + faIcon.invalid).addClass(isValidCol ? faIcon.valid : faIcon.invalid);
        }
        }
    });
});
